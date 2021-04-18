object dora
{
def main(args:Array[String])
{
val conf =new SparkConf().setMaster("local[*]")
val sc =new SparkContext(conf)
val file =sc.textFile("file:///home/dorababu/data.log")
val filfile=file.filter(x=>x.contains("deva"))
filfile.collect().foreach(println)
sc.stop()
}
}
