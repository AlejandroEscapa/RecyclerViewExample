package es.master.p9_recyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import es.master.p9_recyclerview.ViewPager.ContentFragment;

public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_activity);

        ContentFragment contentFragment = new ContentFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.cl_OnboardingConstraint, contentFragment)
                .commit();
    }
}