package com.gfa.w10d01.model;

import java.util.List;

public class EntryOutput {
  List<Entry> entries;
  int entry_count;

  public EntryOutput() {
  }

  public List<Entry> getEntries() {
    return entries;
  }

  public void setEntries(List<Entry> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }

  public void setValues(List<Entry> entryList) {
    entries = entryList;
    this.setEntry_count(entryList.size());
  }
}
