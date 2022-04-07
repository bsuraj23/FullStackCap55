package abcd.demoabcd.controller;

import abcd.demoabcd.payload.ShowsDto;
import abcd.demoabcd.repository.ShowsRepository;
import abcd.demoabcd.tables.Shows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
@RestController
@RequestMapping("/api/auth")
public class ShowController {
    @Autowired
    private ShowsRepository showsRepository;

    @PostMapping("/shows")
    public ResponseEntity<?> registerShows(@RequestBody ShowsDto showsDto) {

        // add check for username exists in a DB
        if (showsRepository.existsSlotNo(showsDto.getSlotNo())) {
            return new ResponseEntity<>("Shows is already taken!", HttpStatus.BAD_REQUEST);
        }


      Shows show = new Shows();

        show.setSlotNo(showsDto.getSlotNo());
        show.setFromDate((Date) showsDto.getFromDate());
        show.setToDate((Date) showsDto.getToDate());
        showsRepository.save(show);

        return new ResponseEntity<>("Show details  successfully", HttpStatus.OK);
    }
}