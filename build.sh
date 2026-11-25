#!/bin/bash
set -e

mkdir -p bin

GOOS=darwin     GOARCH=amd64    go build -ldflags="-s -w" -o bin/axrorcloud-darwin-amd64
GOOS=darwin     GOARCH=arm64    go build -ldflags="-s -w" -o bin/axrorcloud-darwin-arm64
GOOS=linux      GOARCH=386      go build -ldflags="-s -w" -o bin/axrorcloud-linux-386
GOOS=linux      GOARCH=amd64    go build -ldflags="-s -w" -o bin/axrorcloud-linux-amd64
GOOS=linux      GOARCH=arm      go build -ldflags="-s -w" -o bin/axrorcloud-linux-arm
GOOS=linux      GOARCH=arm64    go build -ldflags="-s -w" -o bin/axrorcloud-linux-arm64
GOOS=windows    GOARCH=386      go build -ldflags="-s -w" -o bin/axrorcloud-windows-386.exe
GOOS=windows    GOARCH=amd64    go build -ldflags="-s -w" -o bin/axrorcloud-windows-amd64.exe

echo "All AxrorCloud binaries built successfully in ./bin"