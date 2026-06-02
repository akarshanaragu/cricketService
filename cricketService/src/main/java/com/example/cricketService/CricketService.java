package com.example.cricketService;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketService {
    private final CricketRepository repo;

    public CricketService(CricketRepository repo) {
        this.repo=repo;
    }
    public Cricket saveMatch(Cricket cricket) {

        int player1Score =
                cricket.getPlay1over1() +
                        cricket.getPlay1over2() +
                        cricket.getPlay1over3() +
                        cricket.getPlay1over4() +
                        cricket.getPlay1over5() +
                        cricket.getPlay1over6();

        int player2Score =
                cricket.getPlay2over1() +
                        cricket.getPlay2over2() +
                        cricket.getPlay2over3() +
                        cricket.getPlay2over4() +
                        cricket.getPlay2over5() +
                        cricket.getPlay2over6();


        if (player1Score > player2Score) {
            cricket.setWinner(cricket.getPlayer1());
        }
        else if (player2Score > player1Score) {
            cricket.setWinner(cricket.getPlayer2());
        }
        else {
            cricket.setWinner("Draw");
        }

        return repo.save(cricket);
    }



    public List<Cricket> getAllMatches() {
        return repo.findAll();
    }


    public Cricket getMatchById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Match not found"));
    }


    public void deleteMatch(Long id) {
        repo.deleteById(id);
    }
}