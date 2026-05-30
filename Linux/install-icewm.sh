#!/bin/sh
set -eu

variant="${1:-modern}"

case "$variant" in
  modern|Modern)
    theme_name="LifeOfAVIN-Modern"
    ;;
  classic|Classic)
    theme_name="LifeOfAVIN-Classic"
    ;;
  *)
    echo "Usage: sh Linux/install-icewm.sh [modern|classic]" >&2
    exit 1
    ;;
esac

script_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
source_dir="$script_dir/icewm/themes/$theme_name"
target_base="${XDG_CONFIG_HOME:-$HOME/.icewm}/icewm"

if [ "${XDG_CONFIG_HOME:-}" = "" ]; then
  target_base="$HOME/.icewm"
fi

target_themes="$target_base/themes"
target_theme_dir="$target_themes/$theme_name"

if [ ! -d "$source_dir" ]; then
  echo "Could not find theme source: $source_dir" >&2
  exit 1
fi

mkdir -p "$target_themes"
rm -rf "$target_theme_dir"
cp -R "$source_dir" "$target_theme_dir"
printf 'Theme="%s/default.theme"\n' "$theme_name" > "$target_base/theme"

echo "Installed $theme_name to $target_theme_dir"
echo "Selected Theme=\"$theme_name/default.theme\" in $target_base/theme"

if command -v icewm >/dev/null 2>&1; then
  icewm -r || echo "IceWM restart failed; select the theme from the IceWM menu or restart your session." >&2
else
  echo "IceWM command not found; install IceWM or restart/select the theme manually."
fi
