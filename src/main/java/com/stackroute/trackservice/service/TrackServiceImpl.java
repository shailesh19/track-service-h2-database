package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.repository.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService
{
    private TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository)
    {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track saveTrack(Track track)
    {
        Track savedTrack = trackRepository.save(track);
        return savedTrack;
    }

    @Override
    public Track getTrackbyId(int TrackId)
    {
        Track retrievedTrack = trackRepository.findById(TrackId).get();
        return retrievedTrack;

    }

    @Override
    public List<Track> getAllTracks()
    {
        return trackRepository.findAll();
    }

    @Override
    public Optional<Track> deleteTrackbyId(int TrackId)
    {
         Optional optional= trackRepository.findById(TrackId);
         if(optional.isPresent())
             trackRepository.deleteById(TrackId);
         return optional;
    }
//
//    @Override
//    public Track updateTrack(Track track)
//    {
//        Track updatedTrack = trackRepository.
//    }
}
