package info.folone.fourtytwo

object Residue {
  object Naive {
    case class Residue(m: Int, n: Long) { lhs =>
      def +(rhs: Residue): Residue = if(rhs.m == m) Residue(m, (lhs.n + rhs.n) % m) else throw new RuntimeException
      def ++(rhs: Residue): Option[Residue] = if(rhs.m == m) Some(Residue(m, (lhs.n + rhs.n) % m)) else None
    }
  }

  object Typelevel {
    case class Residue[N <: Int: SingleInhabitant](n: Long) { lhs =>
      def +(rhs: Residue[N]): Residue[N] =
        Residue((lhs.n + rhs.n) % inhabitant[N])
    }
 
    Residue[15](15) + Residue[15](20)
    //Residue[13](15) + Residue[15](20)
  }
}
