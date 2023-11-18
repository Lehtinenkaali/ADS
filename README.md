# ModdedVerse Ads Plugin

## Overview

The ModdedVerse Ads Plugin is a versatile tool that allows you to seamlessly integrate advertisements into your plugin. With easy configuration options provided in the `config.yml` file, you have full control over the appearance and behavior of the ads.

## Features

- **Customization:** Tailor the ads to match your plugin's style with configurable headers, footers, and click actions.
  
- **Easy Configuration:** All settings are conveniently located in the `config.yml` file, making it straightforward to adjust ad content and behavior.

## Getting Started

Follow these simple steps to integrate the ModdedVerse Ads Plugin into your project:

1. **Download the Plugin:** Obtain the plugin jar file from the ModdedVerse website or repository.

2. **Install the Plugin:** Place the jar file in the plugins folder of your server.

3. **Configure Ads:** Open the `config.yml` file to customize ad content, including headers, footers, and click actions.

4. **Reload or Restart:** Reload or restart your server to apply the changes.

## Configuration

In the `config.yml` file, you can find the following options for each ad:

- **URL:** The link to the destination when the ad is clicked.
  
- **Header:** The formatted header text displayed above the ad.
  
- **Footer:** The formatted footer text displayed below the ad.
  
- **Click Action:** The action performed when the ad is clicked, customizable with text and color.

Example configuration for an ad:

```yaml
1:
  url: 'https://discord.com/invite/sVR5jmY7Pe'
  header: '&6&m        &6&lModdedVerse&r&6&m           '
  click: '&r&6Join our discord! &4&lClick here!'
  footer: '&6&m        &6&lModdedVerse&r&6&m           '
  hover: '&7Click to join our discord!'
