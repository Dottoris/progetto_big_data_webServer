package progetto.bigdata.sparksubmitserver.controller;

import org.springframework.web.bind.annotation.*;
import progetto.bigdata.Constants;
import progetto.bigdata.sparkjobexecutor.models.*;
import progetto.bigdata.sparkjobexecutor.query.*;

import java.util.List;

/*
    autore: Nicola
    gestore di chiamate http, ancora da decidere se fare un controller per ogni query e come strutturare
 */
@RestController
public class Controller {


    @CrossOrigin(origins = "*")
    @GetMapping("/geoDataHotelsInNation")
    public @ResponseBody List<GeoDataClass> geodataHotelsInNation(@RequestParam String nation){
        String[] params = {nation};
        Constants.deleteResultDir();
        return GeoDataHotelsInNation.ISTANCE.compute(params);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/wordCountPositive")
    public @ResponseBody List<WordCountItem> wordCountPositive(@RequestParam String hotel){
        String[] params = {hotel};
        Constants.deleteResultDir();
        return WordCountPositive.INSTANCE.compute(params);

    }
    @CrossOrigin(origins = "*")
    @GetMapping("/wordCountNegative")
    public @ResponseBody List<WordCountItem> wordCountNegative(@RequestParam String hotel){
        String[] params = {hotel};
        Constants.deleteResultDir();
        return WordCountNegative.INSTANCE.compute(params);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/coppieHotelPunteggioMedioPerNazione")
    public @ResponseBody List<CoppiaHotelPunteggioMedio> coppieHotelPunteggioMedioPerNazione(@RequestParam String nation){
        String[] params = {nation};
        Constants.deleteResultDir();
        return CoppieHotelPunteggioMedioPerNazione.INSTANCE.compute(params);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/recensioniHotelDallaData")
    public @ResponseBody List<String> recensioniHotelDallaData(@RequestParam String hotel, @RequestParam String days){
        String[] params = {hotel, days};
        Constants.deleteResultDir();
        return RecensioniHotelDallaData.INSTANCE.compute(params);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/coppieHotel_NegReviews")
    public @ResponseBody List<CoppiaHotelNumRecensioni> coppieHotel_NegReviews(){
        Constants.deleteResultDir();
        return CoppieHotel_NegReviews.INSTANCE.compute(null);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/coppieHotel_PosReviews")
    public @ResponseBody List<CoppiaHotelNumRecensioni> coppieHotel_PosReviews(){
        Constants.deleteResultDir();
        return CoppieHotel_PosReviews.INSTANCE.compute(null);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/averageScoreFilter")
    public @ResponseBody List<FilteredItem> averageScoreFilter(@RequestParam String punteggio){
        String[] params = {punteggio};
        Constants.deleteResultDir();
        return AverageScoreFilter.INSTANCE.compute(params);
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/reviewsNumberFilter")
    public @ResponseBody List<ReviewsNumberItem> reviewsNumberFilter(@RequestParam String num){
        String[] params = {num};
        Constants.deleteResultDir();
        return ReviewsNumberFilter.INSTANCE.compute(params);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/demandingClientsPerNationality")
    public @ResponseBody List<CoppiaNazionalit??ClientePunteggioMedio> demandingClientsPerNationality(){
        Constants.deleteResultDir();
        return DemandingClientsPerNationality.INSTANCE.compute(null);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/naiveBayesian")
    public @ResponseBody List<NaiveBayesItem> naiveBayesian(@RequestParam String review){
        String[] params = {review};
        Constants.deleteResultDir();
        return NaiveBayesian.INSTANCE.compute(params);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/timeScoreEvolution")
    public @ResponseBody List<TimeScoreItem> timeScoreEvolution(@RequestParam String hotel){
        String[] params = {hotel};
        Constants.deleteResultDir();
        return TimeScoreEvolution.INSTANCE.compute(params);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/timeScoreEvolutionMonth")
    public @ResponseBody List<TimeScoreItem> timeScoreEvolutionMonth(@RequestParam String hotel){
        String[] params = {hotel};
        Constants.deleteResultDir();
        return TimeScoreEvolutionMonth.INSTANCE.compute(params);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/allFilters")
    public @ResponseBody List<GeoDataClass> allFilters(@RequestParam String nation, @RequestParam String score, @RequestParam String num){
        String[] params = {nation,score,num};
        Constants.deleteResultDir();
        return AllFilters.ISTANCE.compute(params);
    }

}
