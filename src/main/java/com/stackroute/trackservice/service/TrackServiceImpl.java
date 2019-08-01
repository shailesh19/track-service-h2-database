package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;
import com.stackroute.trackservice.repository.TrackRepository;
import org.springframework.stereotype.Service;

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

//    @Override
//    public Track getAllTracks(Track track)
//    {
//        Track allTrack = trackRepository.findAll();
//    }
//
//    @Override
//    public Track deleteTrackbyId(int TrackId)
//    {
//        Track deletedTrack = trackRepository.delete();
//    }
//
//    @Override
//    public Track updateTrack(Track track)
//    {
//        Track updatedTrack = trackRepository.
//    }
}
