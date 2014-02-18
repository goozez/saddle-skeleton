import org.scalatest._
import org.scalatest.junit.ShouldMatchersForJUnit
import org.saddle._
import org.joda.time.LocalDate
import Joda._


class TimeSeriesTest extends WordSpec with GivenWhenThen with ShouldMatchersForJUnit {
  "TimeSeries" when {

    val d2014_02_01 = new LocalDate(2014, 2, 1);
    val d2014_02_03 = new LocalDate(2014, 2, 3);
    val d2014_02_04 = new LocalDate(2014, 2, 4);

    "created with data points as arguments" should {
      "have the earliest point as start, the latest as the end, and a length" in {                   
        val a = TimeSeries(d2014_02_01 -> 0.6, d2014_02_03 -> 4.5, d2014_02_04 -> 0.9)
      }
      }
    }
}
