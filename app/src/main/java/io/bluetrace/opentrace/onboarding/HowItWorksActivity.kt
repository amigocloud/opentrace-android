package io.bluetrace.opentrace.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.amigocloud.contact_tracing.R
import kotlinx.android.synthetic.main.main_activity_howitworks.*

class HowItWorksActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_howitworks)
        btn_onboardingStart.setOnClickListener {
            val intent = Intent(this, OnboardingActivity::class.java)
            startActivity(intent)
        }
    }
}
