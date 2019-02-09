package com.gfa.w10d01.service;

import com.gfa.w10d01.model.Entry;

import java.util.List;

public interface EntryService {

  public void addEntry(Entry entry);
  public List<Entry> listEntries();
}
