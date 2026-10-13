// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus
import kotlin.test.Test
import kotlin.test.assertEquals

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    @Test
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "test for size=1" {
        val out = median(listOf(1.0f))
        assertEquals(1.0f, out)
    }
    "test for size=2" {
        val out = median(listOf(1.0f, 2.0f))
        assertEquals(1.5f, out)
    }
    "test for size=3" {
        val out = median(listOf(2.0f, 1.0f, 3.0f))
        assertEquals(2.0f, out)
    }
    "test for size=4" {
        val out = median(listOf(1.0f, 3.0f, 2.0f, 4.0f))
        assertEquals(2.5f, out)
    }
})
