// Generated by view binder compiler. Do not edit!
package com.elifnuroksuz.odev2024.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.elifnuroksuz.odev2024.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFirstPageBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final EditText editTextDescription;

  @NonNull
  public final EditText editTextTitle;

  @NonNull
  public final RecyclerView recyclerView;

  private FragmentFirstPageBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonAdd,
      @NonNull EditText editTextDescription, @NonNull EditText editTextTitle,
      @NonNull RecyclerView recyclerView) {
    this.rootView = rootView;
    this.buttonAdd = buttonAdd;
    this.editTextDescription = editTextDescription;
    this.editTextTitle = editTextTitle;
    this.recyclerView = recyclerView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFirstPageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFirstPageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_first_page, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFirstPageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAdd;
      Button buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.editTextDescription;
      EditText editTextDescription = ViewBindings.findChildViewById(rootView, id);
      if (editTextDescription == null) {
        break missingId;
      }

      id = R.id.editTextTitle;
      EditText editTextTitle = ViewBindings.findChildViewById(rootView, id);
      if (editTextTitle == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      return new FragmentFirstPageBinding((ConstraintLayout) rootView, buttonAdd,
          editTextDescription, editTextTitle, recyclerView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
