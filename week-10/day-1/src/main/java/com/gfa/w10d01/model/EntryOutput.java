package com.gfa.w10d01.model;

import java.util.ArrayList;
import java.util.List;

public class EntryOutput {
  List<EntryLog> entries;
  int entry_count;

  public EntryOutput() {
  }

  public List<EntryLog> getEntries() {
    return entries;
  }

  public void setEntries(List<EntryLog> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public void setValues(List<Entry> entryList) {
    entries = new ArrayList<>();
    for (Entry entry: entryList) {
      entries.add(new EntryLog(entry.getId(), entry.getEndPoint(), entry.getData()));
    }
    this.setEntry_count(entryList.size());
  }
}
