package com.example.notesapp.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.notesapp.R;
import com.example.notesapp.activity.EditNoteActivity;
import com.example.notesapp.databinding.ActivityEditNoteBinding;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteViewHolder> {

    public NoteAdapter() {
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {

        View view = LayoutInflater.from()

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class NoteViewHolder extends RecyclerView.ViewHolder{

        EditText edtNoteTitle,edtNoteMassage ;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            edtNoteTitle = itemView.findViewById(R.id.edtNoteTitle);
            edtNoteMassage = itemView.findViewById(R.id.edtNoteMassage);
        }
    }
}
