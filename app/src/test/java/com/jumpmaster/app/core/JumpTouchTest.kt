package com.jumpmaster.app.core

import kotlin.random.Random
import org.junit.Assert.assertTrue
import org.junit.Test

class JumpTouchTest {

    @Test
    fun `original swipe position follows wechat_jump_game button area`() {
        val position = JumpTouch.createOriginalSwipePosition(
            width = 1080,
            height = 1920,
            random = Random(7)
        )

        assertTrue(position.startX in 340..740)
        assertTrue(position.endX in 340..740)
        assertTrue(position.startY in 1384..1784)
        assertTrue(position.endY in 1384..1784)
    }

    @Test
    fun `original swipe position scales vertical button area with screenshot height`() {
        val position = JumpTouch.createOriginalSwipePosition(
            width = 720,
            height = 1280,
            random = Random(11)
        )

        assertTrue(position.startX in 160..560)
        assertTrue(position.endX in 160..560)
        assertTrue(position.startY in 856..1256)
        assertTrue(position.endY in 856..1256)
    }
}
