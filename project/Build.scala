import sbt._

object BuildDef extends Build {

  lazy val root = 
    progfunProject(id = "progfun", base = file(".")) 
      .aggregate(weeks: _*)

  // Core Projects
  // ------------
  lazy val weeks: Seq[ProjectReference] =
    Seq(week1) //, week2, week3, week4, week5, week6, week7)

  def project = progfunProject(".") _
  lazy val week1 = project("week1")
  /*
  lazy val week2 = project("week2")
  lazy val week3 = project("week3")
  lazy val week4 = project("week4")
  lazy val week5 = project("week5")
  lazy val week6 = project("week6")
  lazy val week7 = project("week7")
  */

  /** Project definition helper that simplifies creation of `ProjectReference`.
    *
    * It is a convenience method to create a progfun `ProjectReference` module by having the boilerplate for most common
    * activities tucked in.
    *
    * @param base     the base path location of project module.
    * @param prefix   the prefix of project module.
    * @param module   the name of the project module. Typically, a project id is of the form joereader-`module`.
    */
  def progfunProject(base: String, prefix: String = "progfun-")(module: String): Project =
    progfunProject(id = if (module.startsWith(prefix)) module else prefix + module,
                base = file(base) / module.stripPrefix(prefix))

  def progfunProject(id: String, base: File): Project = Project(id, base)
}

