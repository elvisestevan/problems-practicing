import org.example.FairDistributionOfCookies
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class FairDistributionOfCookiesTest {

    val fairDistributionOfCookies = FairDistributionOfCookies()

    @Test
    fun distribute() {

        assertEquals(31, fairDistributionOfCookies.distributeCookies(intArrayOf(8, 15, 10, 20, 8), 2))
        assertEquals(7, fairDistributionOfCookies.distributeCookies(intArrayOf(6,1,3,2,2,4,1,2), 3))

    }

}