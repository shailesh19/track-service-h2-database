package com.stackroute.trackservice.controller;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
public class TrackController
{
    private TrackService trackService;

    public TrackController()
    {
    }

    @Autowired
    public TrackController(TrackService trackService)
    {
        this.trackService = trackService;
    }

    @PostMapping("track")
    public ResponseEntity<?> saveTrack(@RequestBody Track track)
    {
        Track savedTrack = trackService.saveTrack(track);
        return new ResponseEntity<>(savedTrack, HttpStatus.OK);
    }

    @GetMapping("track/{trackId}")
    public ResponseEntity<?> getTrackById(@PathVariable int trackId)
    {
        Track retrievedTrack = trackService.getTrackbyId(trackId);
        return new ResponseEntity<>(retrievedTrack,HttpStatus.OK);
    }

    @GetMapping("alltrack")
    public ResponseEntity<?> getAllTracks()
    {
        List<Track> allTrack = trackService.getAllTracks();
        return new ResponseEntity<>(allTrack,HttpStatus.OK);
    }

    @DeleteMapping("deletetrack")
    public ResponseEntity<?> deleteTrackById(@RequestParam int trackID)
    {
        Optional deletedTrack = trackService.deleteTrackbyId(trackID);
        return new ResponseEntity<>(deletedTrack,HttpStatus.OK);
    }



}
