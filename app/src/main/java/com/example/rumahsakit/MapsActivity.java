package com.example.rumahsakit;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Membuar mark pada tempat tinggal User
        LatLng TempatTinggal = new LatLng(-0.842574, 119.888031);
        // Custom size marker
        int tinggi = 100;
        int lebar = 70;
        BitmapDrawable bitmapDraw = (BitmapDrawable)getResources().getDrawable(R.drawable.lokasiucup);
        Bitmap b = bitmapDraw.getBitmap();
        Bitmap markerKecil = Bitmap.createScaledBitmap(b, lebar, tinggi, false);
        //Masukan Ke Map
        mMap.addMarker(new MarkerOptions().position(TempatTinggal).title("Moh. Yusuf F55118068)").snippet("Kos").icon(BitmapDescriptorFactory.fromBitmap(markerKecil)));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(TempatTinggal, 13.5f));

        LatLng RSUntad = new LatLng(-0.843381, 119.897388);
        mMap.addMarker(new MarkerOptions().position(RSUntad).title("RS UnTad"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSUntad));

        LatLng RSUndata = new LatLng(-0.8583616, 119.8844506);
        mMap.addMarker(new MarkerOptions().position(RSUndata).title("RS Undata"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSUndata));

        LatLng RSUndataBaru = new LatLng(-0.858363, 119.884001);
        mMap.addMarker(new MarkerOptions().position(RSUndataBaru).title("RS Undata Baru"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSUndataBaru));

        LatLng RSSitiFadhila = new LatLng(-0.871690, 119.883849);
        mMap.addMarker(new MarkerOptions().position(RSSitiFadhila).title("RS Siti Fadhila"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSSitiFadhila));

        LatLng RSBhayangkara = new LatLng(-0.889243, 119.867882);
        mMap.addMarker(new MarkerOptions().position(RSBhayangkara).title("RS Bhayangkara Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSBhayangkara));

        LatLng RSBhayangkaraPolda = new LatLng(-0.889102, 119.867696);
        mMap.addMarker(new MarkerOptions().position(RSBhayangkaraPolda).title("RS Bhayangkara Polda"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSBhayangkaraPolda));

        LatLng RSBCareShe = new LatLng(-0.891860, 119.875155);
        mMap.addMarker(new MarkerOptions().position(RSBCareShe).title("RS Bersalin Care She"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSBCareShe));

        LatLng RSWoodward = new LatLng(-0.904645, 119.871600);
        mMap.addMarker(new MarkerOptions().position(RSWoodward).title("RS Woodward Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSWoodward));

        LatLng RSUDAnutapuraPalu = new LatLng(-0.8926329, 119.8515559);
        mMap.addMarker(new MarkerOptions().position(RSUDAnutapuraPalu).title("RSUD Anutapura Palu"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSUDAnutapuraPalu));

        LatLng RSMashita = new LatLng(-0.900122, 119.8491821);
        mMap.addMarker(new MarkerOptions().position(RSMashita).title("RSUD Mashita"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(RSMashita));

        mMap.addPolyline(new PolylineOptions().add(
                TempatTinggal,
                new LatLng(-0.842569, 119.888133),
                new LatLng(-0.843068, 119.888063),
                new LatLng(-0.843266, 119.888074),
                new LatLng(-0.843400, 119.889689),
                new LatLng(-0.843448, 119.890896),
                new LatLng(-0.843471, 119.891414),
                new LatLng(-0.843499, 119.894966),
                new LatLng(-0.843517, 119.897391),
                RSUntad
                ).width(10)
                        .color(Color.BLACK)
        );
    }
}