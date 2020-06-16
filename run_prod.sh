#!/usr/bin/env bash

runApp() {
    MY_PATH=$(dirname "$0")
    MY_PATH=$( (cd "$MY_PATH" && pwd))
    APP_PATH="${MY_PATH}"

    export alpas_run_mode="console"
    export alpas_root_dir="$APP_PATH"

    java -jar alpacasToDo.jar $*

    unset alpas_run_mode
    unset alpas_root_dir
}

if [[ $# -eq 1 ]]; then
  case "$1" in
  help)
      runApp --help
      ;;
  *)
      runApp "$@"
      ;;
  esac
else
  runApp "$@"
fi