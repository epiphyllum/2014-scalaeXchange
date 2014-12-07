package info.folone.fourtytwo

object Ranged {
  class Ranged[From <: Int : SingleInhabitant, To <: Int : SingleInhabitant] {
    def sample = {
      val rnd = new scala.util.Random
      val from = inhabitant[From]
      val to   = inhabitant[To]
      (from + rnd.nextInt(to - from + 1))
    }
  }
 
  val range = new Ranged[10, 20]
  range.sample
}
