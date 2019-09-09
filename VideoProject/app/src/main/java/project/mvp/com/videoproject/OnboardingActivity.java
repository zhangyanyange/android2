/*
 * Copyright (c) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package project.mvp.com.videoproject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v17.leanback.app.GuidedStepFragment;
import android.support.v17.leanback.widget.GuidanceStylist;
import android.support.v17.leanback.widget.GuidedAction;
import android.text.InputType;
import android.widget.Toast;

import java.util.List;


/*
 * OnboardingActivity for OnboardingFragment
 */
public class OnboardingActivity extends Activity {
    private static final int CONTINUE = 2;
    private static GuidedAction sEnterUsername;
    private static GuidedAction sEnterPassword;
    private static String sAccount;
    private static String sPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (null == savedInstanceState) {
            GuidedStepFragment.addAsRoot(this, new FirstStepFragment(), android.R.id.content);
        }
    }

    public static class FirstStepFragment extends GuidedStepFragment {
        @Override
        public int onProvideTheme() {
            return R.style.Theme_Example_Leanback_GuidedStep_First;
        }

        @Override
        @NonNull
        public GuidanceStylist.Guidance onCreateGuidance(@NonNull Bundle savedInstanceState) {
            String title = getString(R.string.pref_title_screen_signin);
            String description = getString(R.string.pref_title_login_description);
            Drawable icon = getActivity().getDrawable(R.drawable.ic_main_icon);
            return new GuidanceStylist.Guidance(title, description, "", icon);
        }

        @Override
        public void onCreateActions(@NonNull List<GuidedAction> actions, Bundle savedInstanceState) {
            sEnterUsername = new GuidedAction.Builder()
                    .title(getString(R.string.pref_title_username))
                    .id(1)
                    .descriptionEditable(true)
                    .build();

            sEnterPassword = new GuidedAction.Builder()
                    .title(getString(R.string.pref_title_password))
                    .id(3)
                    .descriptionEditable(true)
                    .descriptionInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD | InputType.TYPE_CLASS_TEXT)
                    .build();
            GuidedAction login = new GuidedAction.Builder()
                    .id(CONTINUE)
                    .title("登录")
                    .build();
            actions.add(sEnterUsername);
            actions.add(sEnterPassword);
            actions.add(login);
        }

        @Override
        public void onGuidedActionClicked(GuidedAction action) {
            if (action.getId() == CONTINUE) {
                System.out.println(sAccount);
                if(sAccount.equals("123")&&sPassword.equals("123")){
                    getActivity().finishAfterTransition();
                    // Assume the user was logged in
                    Toast.makeText(getActivity(), "Welcome!", Toast.LENGTH_SHORT).show();
                    PrefUtils.putBoolean(getActivity(),"isLogin",true);
                    startActivity(new Intent(getActivity(),MainActivity.class));
                }
                // TODO Authenticate your account


            }
        }

        @Override
        public void onGuidedActionEdited(GuidedAction action) {
            if(action.getId()==1){
                sAccount = action.getDescription().toString();
            }else if(action.getId()==3){
                sPassword = action.getDescription().toString();
            }
            super.onGuidedActionEdited(action);
        }

    }
}