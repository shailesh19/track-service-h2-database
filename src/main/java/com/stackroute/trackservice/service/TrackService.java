package com.stackroute.trackservice.service;

import com.stackroute.trackservice.domain.Track;

public interface TrackService
{
    public Track saveTrack(Track track);
    public Track getTrackbyId(int TrackId);
//    public Track getAllTracks(Track track);
//    public Track deleteTrackbyId(int TrackId);
//    public Track updateTrack();

}
