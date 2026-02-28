#!/bin/bash
while true
do
  git add .
  git diff --cached --quiet || git commit -m "Auto update $(date)"
  git push origin main
  sleep 30
done
