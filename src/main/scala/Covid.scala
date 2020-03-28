//simple script to convert data from format of pcm-dcpm to denormalized for multipleTimeSeries
object Covid extends App {
    val schema = List("data","stato","ricoverati_con_sintomi","terapia_intensiva","totale_ospedalizzati",
        "isolamento_domiciliare","totale_attualmente_positivi","nuovi_attualmente_positivi",
        "dimessi_guariti","deceduti","totale_casi","tamponi")
    
    val data = List(
        //insert here data to process
            List("2020-03-24 17:00:00","ITA","21937","3396","25333","28697","54030","3612","8326","6820","69176","296964"),
            List("2020-03-25 17:00:00","ITA","23112","3489","26601","30920","57521","3491","9362","7503","74386","324445"),
            List("2020-03-26 17:00:00","ITA","24753","3612","28365","33648","62013","4492","10361","8165","80539","361060"),
            List("2020-03-27 17:00:00","ITA","26029","3732","29761","36653","66414","4401","10950","9134","86498","394079"),
            List("2020-03-28 17:00:00","ITA","26676","3856","30532","39533","70065","3651","12384","10023","92472","429526")
        )
    
    println(data.map(l=>l.zip(schema)).map(l=>l.map(el=>(l(0)._1, "ITA", el._1 , el._2)).drop(2)).flatten)
}