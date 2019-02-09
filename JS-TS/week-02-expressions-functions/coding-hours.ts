'use strict';

// An average Green Fox attendee codes 6 hours daily
// The semester is 17 weeks long
//
// Print how many hours is spent with coding in a semester by an attendee,
// if the attendee only codes on workdays.
//
// Print the percentage of the coding hours in the semester if the average
// work hours weekly is 52
let dailyCoding = 6;
let semesterLength = 17;
let workdays = 5;
let workhoursWeekly = 52;

console.log("An attendee codes " + (dailyCoding * semesterLength * workdays) + " hours during the semester.");
console.log("An attendee is coding " + (dailyCoding * 5) / workhoursWeekly * 100 + " % on average at Greenfox.");