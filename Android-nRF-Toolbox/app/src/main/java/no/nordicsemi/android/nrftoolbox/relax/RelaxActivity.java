package no.nordicsemi.android.nrftoolbox.relax;

import android.content.Intent;
import android.graphics.Point;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.TextView;

import org.achartengine.GraphicalView;

import java.util.List;
import java.util.UUID;

import no.nordicsemi.android.nrftoolbox.FeaturesActivity;
import no.nordicsemi.android.nrftoolbox.R;
import no.nordicsemi.android.nrftoolbox.hr.HRManager;
import no.nordicsemi.android.nrftoolbox.profile.BleProfileActivity;
import no.nordicsemi.android.nrftoolbox.profile.LoggableBleManager;

public abstract class RelaxActivity extends BleProfileActivity{
    private TextView calmText;
    protected void onCreateView(final Bundle savedInstanceState) {
        setContentView(R.layout.activity_feature_anxious);
        setGui();
    }
    private void setGui(){
        //calmText = findViewById(R.id.calm54321);
    }
    protected void onStart() {
        super.onStart();
        final Intent intent = getIntent();
    }






}
