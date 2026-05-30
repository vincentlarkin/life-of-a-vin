#!/bin/sh
set -eu

variant="${1:-all}"

case "$variant" in
  all|All)
    theme_names="LifeOfAVIN-Modern LifeOfAVIN-Classic"
    selected_theme="LifeOfAVIN-Modern"
    ;;
  modern|Modern)
    theme_names="LifeOfAVIN-Modern"
    selected_theme="LifeOfAVIN-Modern"
    ;;
  classic|Classic)
    theme_names="LifeOfAVIN-Classic"
    selected_theme="LifeOfAVIN-Classic"
    ;;
  *)
    echo "Usage: sh Linux/install-icewm.sh [all|modern|classic]" >&2
    exit 1
    ;;
esac

script_dir=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
target_base="${XDG_CONFIG_HOME:-$HOME/.icewm}/icewm"

if [ "${XDG_CONFIG_HOME:-}" = "" ]; then
  target_base="$HOME/.icewm"
fi

target_themes="$target_base/themes"

mkdir -p "$target_themes"

for theme_name in $theme_names; do
  source_dir="$script_dir/icewm/themes/$theme_name"
  target_theme_dir="$target_themes/$theme_name"

  if [ ! -d "$source_dir" ]; then
    echo "Could not find theme source: $source_dir" >&2
    exit 1
  fi

  rm -rf "$target_theme_dir"
  cp -R "$source_dir" "$target_theme_dir"
  echo "Installed $theme_name to $target_theme_dir"
done

printf 'Theme="%s/default.theme"\n' "$selected_theme" > "$target_base/theme"
echo "Selected Theme=\"$selected_theme/default.theme\" in $target_base/theme"

if command -v icewm >/dev/null 2>&1; then
  icewm -r || echo "IceWM restart failed; select the theme from the IceWM menu or restart your session." >&2
else
  echo "IceWM command not found; install IceWM or restart/select the theme manually."
fi
