package edu.escuelaing.arsw.labs.boardws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.escuelaing.arsw.labs.boardws.endpoints.BoardEndPoint;
import edu.escuelaing.arsw.labs.boardws.model.Board;

@RestController
public class BoardController {

    @GetMapping("/clear")
    public void clear() {
        Board.getInstance().clear();
        BoardEndPoint.send("reset", true);
    }
}
