//simple script to convert data from format of pcm-dcpm to denormalized for multipleTimeSeries
object Covid extends App {
    val schema = List("data","stato","ricoverati_con_sintomi","terapia_intensiva","totale_ospedalizzati",
        "isolamento_domiciliare","totale_attualmente_positivi","nuovi_attualmente_positivi",
        "dimessi_guariti","deceduti","totale_casi","tamponi")
    
    val data = List(
        //insert here data to process
        List("2020-03-22","ITA","19846","3009","22855","23783","46638","3957","7024","5476","59138","258402"),
        List("2020-03-23","ITA","20692","3204","23896","26522","50418","3780","7432","6077","63927","275468")
        )
    
    println(data.map(l=>l.zip(schema)).map(l=>l.map(el=>(l(0)._1, "ITA", el._1 , el._2)).drop(2)).flatten)
}