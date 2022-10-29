package myweb.secondboard.repository;

import myweb.secondboard.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {

    @Query("select p from Player p where p.matching.id = :matchId")
    List<Player> findAllByMatchingId(@Param("matchId") Long matchId);
}
