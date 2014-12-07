package info.folone.fourtytwo

object Records {
  object Shapeless {
    import shapeless._, syntax.singleton._, record._, ops.hlist._
 
    val lookup = (1 ->> "Panda!") :: ("Age"  ->> 3) :: ("Name"  ->>  "Jane") :: HNil
 
    lookup(1)
    lookup("Age")
    lookup("Name")
  }

  object Demo {
    trait Assoc[K] { type V ; val v: V }
 
    def mkAssoc[K, V0](k: K, v0: V0): Assoc[k.type] { type V = V0 } = new Assoc[k.type] {type V = V0 ; val v = v0}
    def lookup[K](k: K)(implicit a: Assoc[k.type]): a.V = a.v

    implicit def firstAssoc = mkAssoc(1, "Panda!")
    implicit def secondAssoc = mkAssoc(2, 2.0)

    implicit def ageAssoc = mkAssoc("Age", 3)
    implicit def nmAssoc = mkAssoc("Name", "Jane")

    lookup(1)
    lookup(2)
    lookup("Age")
    lookup("Name")
  }
}
