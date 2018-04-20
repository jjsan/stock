package sk.adrian.stockregistry;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import sk.adrian.stockregistry.fragments.MainViewFragment;
import sk.adrian.stockregistry.fragments.StockItemListFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set view - fragment holder
        setContentView(R.layout.main_fragment_holder);

        // let set first fragment
        if (savedInstanceState == null) {
            // Let's first dynamically add a fragment into a frame container
            // get fragment manager
            FragmentManager fm = getFragmentManager();
            // add
            FragmentTransaction ft = fm.beginTransaction().setCustomAnimations(0, 0);
//                    .setCustomAnimations(
//                            R.animator.card_flip_right_in,
//                            R.animator.card_flip_right_out,
//                            R.animator.card_flip_left_in,
//                            R.animator.card_flip_left_out);
            // ft.add(R.id.registration_fragment_holder, new RegistrationCodeFragment());

            ft.add(R.id.fragment_holder, new MainViewFragment());
//            ft.add(R.id.fragment_holder, new StockItemListFragment());
            ft.commitAllowingStateLoss();
        }
    }
}
