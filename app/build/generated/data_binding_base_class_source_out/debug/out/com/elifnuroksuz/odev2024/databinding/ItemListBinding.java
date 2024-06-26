// Generated by view binder compiler. Do not edit!
package com.elifnuroksuz.odev2024.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.elifnuroksuz.odev2024.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button buttonDelete;

  @NonNull
  public final CheckBox checkboxCompleted;

  @NonNull
  public final TextView textViewDescription;

  @NonNull
  public final TextView textViewTitle;

  private ItemListBinding(@NonNull LinearLayout rootView, @NonNull Button buttonDelete,
      @NonNull CheckBox checkboxCompleted, @NonNull TextView textViewDescription,
      @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.buttonDelete = buttonDelete;
    this.checkboxCompleted = checkboxCompleted;
    this.textViewDescription = textViewDescription;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonDelete;
      Button buttonDelete = ViewBindings.findChildViewById(rootView, id);
      if (buttonDelete == null) {
        break missingId;
      }

      id = R.id.checkboxCompleted;
      CheckBox checkboxCompleted = ViewBindings.findChildViewById(rootView, id);
      if (checkboxCompleted == null) {
        break missingId;
      }

      id = R.id.textViewDescription;
      TextView textViewDescription = ViewBindings.findChildViewById(rootView, id);
      if (textViewDescription == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new ItemListBinding((LinearLayout) rootView, buttonDelete, checkboxCompleted,
          textViewDescription, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
