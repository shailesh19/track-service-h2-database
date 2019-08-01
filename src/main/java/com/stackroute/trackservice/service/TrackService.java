package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;

import java.util.List;
import java.util.Optional;

public interface TrackService
{
    public Track saveTrack(Track track);
    public Track getTrackbyId(int TrackId);
    public List<Track> getAllTracks();
    public Optional deleteTrackbyId(int TrackId);
//    public Track updateTrack();

}
