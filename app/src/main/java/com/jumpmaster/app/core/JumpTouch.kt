package com.jumpmaster.app.core

import kotlin.random.Random

data class SwipePosition(
    val startX: Int,
    val startY: Int,
    val endX: Int,
    val endY: Int
)

object JumpTouch {
    fun createOriginalSwipePosition(
        width: Int,
        height: Int,
        random: Random = Random.Default
    ): SwipePosition {
        val safeWidth = width.coerceAtLeast(2)
        val safeHeight = height.coerceAtLeast(2)
        val left = safeWidth / 2
        val top = (1584f * (safeHeight / 1920f)).toInt()
        val x1 = random.nextInt(left - 200, left + 201).coerceIn(1, safeWidth - 1)
        val y1 = random.nextInt(top - 200, top + 201).coerceIn(1, safeHeight - 1)
        val x2 = random.nextInt(left - 200, left + 201).coerceIn(1, safeWidth - 1)
        val y2 = random.nextInt(top - 200, top + 201).coerceIn(1, safeHeight - 1)
        return SwipePosition(x1, y1, x2, y2)
    }
}
