package com.example.android.skeletonapp;

import org.osmdroid.ResourceProxy.string;
import org.osmdroid.tileprovider.MapTile;
import org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase;



public class MyTileSource extends OnlineTileSourceBase { 
	

	public MyTileSource(String aName, string aResourceId, int aZoomMinLevel, 
			int aZoomMaxLevel, int aTileSizePixels, 
			String aImageFilenameEnding, String[] aBaseUrl) { 
		super(aName, aResourceId, aZoomMinLevel, aZoomMaxLevel, aTileSizePixels, 
				aImageFilenameEnding, aBaseUrl); 
		
	} 

	@Override 
	public String getTileURLString(MapTile aTile) { 
		//http://maps.kosmosnimki.ru/TileService.ashx?request=getTile&apikey=P8DQBF1TBW&LayerName=E50931C3B2DD4E0FA2C03366552EEAA1&z=1&x=1&y=1	
		//???
		//http://maps.kosmosnimki.ru/TileService.ashx?request=getTile&apikey=P8DQBF1TBW&LayerName=E50931C3B2DD4E0FA2C03366552EEAA1&z=13&x=151143&y=84247
		//http://maps.kosmosnimki.ru/TileService.ashx?request=getTile&apikey=P8DQBF1TBW&LayerName=E50931C3B2DD4E0FA2C03366552EEAA1&z=14&x=9310&y=5198
		return getBaseUrl() + "?request=getTile&apikey=P8DQBF1TBW&LayerName=E50931C3B2DD4E0FA2C03366552EEAA1" + "&z=" + aTile.getZoomLevel() + "&x=" + 
		aTile.getX() + "&y=" + aTile.getY(); 
	} 



} 
