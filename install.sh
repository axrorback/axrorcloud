#!/bin/bash

set -e

URL_PREFIX="https://github.com/axrorback/axrorcloud/releases/download/v1.0.0"
INSTALL_DIR=${INSTALL_DIR:-/usr/local/bin}

case "$(uname -sm)" in
  "Darwin x86_64") FILENAME="axrorcloud-darwin-amd64" ;;
  "Darwin arm64") FILENAME="axrorcloud-darwin-arm64" ;;
  "Linux x86_64") FILENAME="axrorcloud-linux-amd64" ;;
  "Linux i686") FILENAME="axrorcloud-linux-386" ;;
  "Linux armv7l") FILENAME="axrorcloud-linux-arm" ;;
  "Linux aarch64") FILENAME="axrorcloud-linux-arm64" ;;
  *) echo "Unknown architecture: $(uname -sm) is not supported." >&2; exit 1 ;;
esac

echo "Downloading $FILENAME from GitHub..."
if ! curl -sSLf "$URL_PREFIX/$FILENAME" -o "$INSTALL_DIR/axrorcloud"; then
  echo "Failed to write to $INSTALL_DIR; please try running with sudo." >&2
  exit 1
fi

if ! chmod +x "$INSTALL_DIR/axrorcloud"; then
  echo "Failed to grant execution permissions to $INSTALL_DIR/axrorcloud." >&2
  exit 1
fi

echo "AxrorCloud has been successfully installed!"