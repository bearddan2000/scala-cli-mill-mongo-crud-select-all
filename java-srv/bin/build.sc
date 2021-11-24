import mill._, scalalib._

// `HelloWorld` must match the subdirectory name
object CLI extends ScalaModule {
    def scalaVersion = "2.12.7"

    def ivyDeps = Agg(
        ivy"org.mongodb:mongo-java-driver:3.12.7"
    )
}
