package socbibi.flappy_bird

import android.content.Context
import android.graphics.*
import android.view.MotionEvent
import android.view.SurfaceHolder
import android.view.SurfaceView
import kotlin.random.Random

class GameView(context: Context) : SurfaceView(context), Runnable {

    private var isPlaying = true
    private var birdY = 500f
    private var velocity = 0f
    private var gravity = 0.6f
    private var score = 0

    private val background = BitmapFactory.decodeResource(resources, R.drawable.background)
    private val bird = BitmapFactory.decodeResource(resources, R.drawable.bird)
    private val pipe = BitmapFactory.decodeResource(resources, R.drawable.pipe)

    private val paint = Paint().apply {
        color = Color.WHITE
        textSize = 80f
        typeface = Typeface.DEFAULT_BOLD
    }

    private val pipes = mutableListOf<Pair<Float, Float>>() // (x, y)
    private val pipeGap = 400
    private val pipeDistance = 600

    private var screenWidth = 0
    private var screenHeight = 0

    private val thread = Thread(this)

    init {
        holder.addCallback(object : SurfaceHolder.Callback {
            override fun surfaceCreated(holder: SurfaceHolder) {
                screenWidth = width
                screenHeight = height
                resetPipes()
                isPlaying = true
                thread.start()
            }

            override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {}
            override fun surfaceDestroyed(holder: SurfaceHolder) {
                isPlaying = false
            }
        })
    }

    private fun resetPipes() {
        pipes.clear()
        for (i in 0..3) {
            val x = screenWidth + i * pipeDistance
            val y = Random.nextInt(200, screenHeight - 400).toFloat()
            pipes.add(Pair(x.toFloat(), y))
        }
    }

    override fun run() {
        while (isPlaying) {
            update()
            draw()
            Thread.sleep(16) // ~60 FPS
        }
    }

    private fun update() {
        velocity += gravity
        birdY += velocity

        // Di chuyển ống
        for (i in pipes.indices) {
            val (x, y) = pipes[i]
            pipes[i] = Pair(x - 10, y)
        }

        // Tạo ống mới khi ống cũ ra ngoài màn hình
        if (pipes.first().first < -pipe.width) {
            pipes.removeAt(0)
            val newX = pipes.last().first + pipeDistance
            val newY = Random.nextInt(200, screenHeight - 400).toFloat()
            pipes.add(Pair(newX, newY))
            score++
        }

        // Giới hạn chim
        if (birdY < 0) birdY = 0f
        if (birdY > screenHeight - bird.height) {
            birdY = (screenHeight - bird.height).toFloat()
            isPlaying = false // Game over
        }

        // Kiểm tra va chạm
        val birdRect = Rect(200, birdY.toInt(), 200 + bird.width, birdY.toInt() + bird.height)
        for ((x, y) in pipes) {
            val topPipe = Rect(x.toInt(), 0, x.toInt() + pipe.width, y.toInt())
            val bottomPipe = Rect(
                x.toInt(),
                (y + pipeGap).toInt(),
                x.toInt() + pipe.width,
                screenHeight
            )
            if (Rect.intersects(birdRect, topPipe) || Rect.intersects(birdRect, bottomPipe)) {
                isPlaying = false
                break
            }
        }
    }

    private fun draw() {
        if (!holder.surface.isValid) return
        val canvas = holder.lockCanvas()
        canvas.drawBitmap(background, null, Rect(0, 0, screenWidth, screenHeight), null)

        // Vẽ ống
        for ((x, y) in pipes) {
            val topRect = Rect(x.toInt(), 0, x.toInt() + pipe.width, y.toInt())
            val bottomRect = Rect(
                x.toInt(),
                (y + pipeGap).toInt(),
                x.toInt() + pipe.width,
                screenHeight
            )
            canvas.drawBitmap(pipe, null, topRect, null)
            canvas.drawBitmap(pipe, null, bottomRect, null)
        }

        // Vẽ chim
        canvas.drawBitmap(bird, 200f, birdY, null)

        // Vẽ điểm
        canvas.drawText("Score: $score", 50f, 100f, paint)

        holder.unlockCanvasAndPost(canvas)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (event.action == MotionEvent.ACTION_DOWN && isPlaying) {
            velocity = -10f // nhảy lên
        } else if (!isPlaying && event.action == MotionEvent.ACTION_DOWN) {
            // Chạm để chơi lại
            resetGame()
        }
        return true
    }

    private fun resetGame() {
        birdY = 500f
        velocity = 0f
        score = 0
        resetPipes()
        isPlaying = true
        Thread(this).start()
    }
}