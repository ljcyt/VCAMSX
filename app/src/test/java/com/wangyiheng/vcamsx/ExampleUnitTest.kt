package com.wangyiheng.vcamsx

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun extractContent_returnsPath() {
        val provider = com.wangyiheng.vcamsx.utils.VideoProvider()
        val uri = "content://com.wangyiheng.vcamsx.videoprovider/sample/video.mp4"
        val result = provider.extractContent(uri)
        assertEquals("sample/video.mp4", result)
    }
}