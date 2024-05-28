package com.example.notesapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.notesapp.R;
import com.example.notesapp.adapter.NoteAdapter;
import com.example.notesapp.databinding.ActivityEditNoteBinding;

public class EditNoteActivity extends AppCompatActivity {

    ActivityEditNoteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEditNoteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.noteSaveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EditNoteActivity.this, NoteAdapter.class);
                intent.putExtra("title",R.id.edtNoteTitle);
                intent.putExtra("massage",R.id.edtNoteMassage);
                startActivity(intent);
            }
        });


    }
}