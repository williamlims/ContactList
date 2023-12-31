// Generated by view binder compiler. Do not edit!
package br.edu.scl.ifsp.sdm.contactlist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import br.edu.scl.ifsp.sdm.contactlist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView contactsRv;

  @NonNull
  public final ToolbarBinding toolbarIn;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull RecyclerView contactsRv,
      @NonNull ToolbarBinding toolbarIn) {
    this.rootView = rootView;
    this.contactsRv = contactsRv;
    this.toolbarIn = toolbarIn;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.contactsRv;
      RecyclerView contactsRv = ViewBindings.findChildViewById(rootView, id);
      if (contactsRv == null) {
        break missingId;
      }

      id = R.id.toolbarIn;
      View toolbarIn = ViewBindings.findChildViewById(rootView, id);
      if (toolbarIn == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbarIn = ToolbarBinding.bind(toolbarIn);

      return new ActivityMainBinding((ConstraintLayout) rootView, contactsRv, binding_toolbarIn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
