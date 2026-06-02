package com.example.cricketService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/cricket")
public class CricketController {

    private final CricketService service;

    public CricketController(CricketService service) {
        this.service = service;
    }


    @PostMapping("/add")
    public Cricket addMatch(@RequestParam String player1,
                            @RequestParam String player2,

                            @RequestParam int play1over1,
                            @RequestParam int play1over2,
                            @RequestParam int play1over3,
                            @RequestParam int play1over4,
                            @RequestParam int play1over5,
                            @RequestParam int play1over6,

                            @RequestParam int play2over1,
                            @RequestParam int play2over2,
                            @RequestParam int play2over3,
                            @RequestParam int play2over4,
                            @RequestParam int play2over5,
                            @RequestParam int play2over6) {

        Cricket cricket = new Cricket();

        cricket.setPlayer1(player1);
        cricket.setPlayer2(player2);

        cricket.setPlay1over1(play1over1);
        cricket.setPlay1over2(play1over2);
        cricket.setPlay1over3(play1over3);
        cricket.setPlay1over4(play1over4);
        cricket.setPlay1over5(play1over5);
        cricket.setPlay1over6(play1over6);

        cricket.setPlay2over1(play2over1);
        cricket.setPlay2over2(play2over2);
        cricket.setPlay2over3(play2over3);
        cricket.setPlay2over4(play2over4);
        cricket.setPlay2over5(play2over5);
        cricket.setPlay2over6(play2over6);

        return service.saveMatch(cricket);
    }



    @GetMapping("/all")
    public List<Cricket> getAllMatches() {
        return service.getAllMatches();
    }


    @GetMapping("/{id}")
    public Cricket getMatch(@PathVariable Long id) {
        return service.getMatchById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteMatch(@PathVariable Long id) {
        service.deleteMatch(id);
        return "Match deleted successfully";
    }
}