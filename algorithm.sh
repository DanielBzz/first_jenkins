#!/bin/bash
echo "MODIFY THE ALGORITHM TO PRODUCE A MORE PRECISE CALCULATION OF PI" | tee report.txt
echo "3.14159" | tee -a report.txt
echo "scale=1000; 4*a(1)" | bc -l | tee report.txt
