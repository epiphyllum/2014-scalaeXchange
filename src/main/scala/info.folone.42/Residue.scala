package info.folone.fourtytwo

object Residue {
  case class Residue[N <: Int: SingleInhabitant](n: Long) { lhs =>
    def +(rhs: Residue[N]): Residue[N] =
      Residue((lhs.n + rhs.n) % inhabitant[N])
  }
 
  Residue[15](15) + Residue[15](20)
  //Residue[13](15) + Residue[13](20)
}
