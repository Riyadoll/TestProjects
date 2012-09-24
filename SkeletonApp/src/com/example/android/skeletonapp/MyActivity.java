package com.example.android.skeletonapp;

import org.osmdroid.tileprovider.tilesource.ITileSource;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;

public class MyActivity extends Activity{

	private ITileSource _ITileSource = null;
	public static MapView mapView ;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a_map);

		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_NOSENSOR);

		mapView = (MapView)findViewById(R.id.mapView);
		mapView.setBuiltInZoomControls(true);
		mapView.setMultiTouchControls(true);

		_ITileSource = new MyTileSource("C9458F2DCB754CEEACC54216C7D1EB0A", null, 2, 13, 
				256, "", new String[]{"http://maps.kosmosnimki.ru/TileService.ashx"}); 


		mapView.setTileSource(_ITileSource);
		
		GeoPoint move_gpt = new GeoPoint(53.51, 27.30);
		mapView.getController().setZoom(9);		
		mapView.getController().setCenter(move_gpt);

	}

}
