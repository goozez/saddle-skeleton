import org.saddle._
import org.joda.time.LocalDate
import Joda._

object Joda {
      implicit def dateTimeOrdering: Ordering[LocalDate] = Ordering.fromLessThan(_ isBefore _)
}

object TimeSeries {

  def apply[V: ST](values: (LocalDate, V)*): TimeSeries[V] = {
    new TimeSeries(Series(values: _*))
  }
  }

class TimeSeries[V: ST](values: Series[LocalDate, V]) {  }
