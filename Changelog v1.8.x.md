--------------------------Changelog for v1.8.4.1 of SecurityCraft--------------------------

- Fix: [1.8+] Crash when inserting a module into a Laser Block (Thanks Shrimplet596!)

--------------------------Changelog for v1.8.4 of SecurityCraft--------------------------

- New: Inventory Scanners can now be configured to have a higher range, similar to Laser Blocks
- Change: Password-protected blocks no longer have a crafting recipe. Instead, rightclick a Frame/Chest/Furnace with a Key Panel to create them (any contents are safe!)
- Fix: Sounds don't respect their correct categories
- Fix: Laser fields break when breaking other Laser Blocks placed orthogonal to the fields
- Fix: Items can be duplicated within the Module GUI
- Fix: Reinforced Iron Trapdoor can be broken by any player (Thanks shaiapouf!)
- Fix: Portable Radar can be broken by any player
- Fix: Username Logger can be broken by any player
- Fix: Alarm sound pitch is incorrect
- Fix: [1.8-1.8.8/9] Reinforced Iron Fence Gate is not craftable
- Fix: [1.8-1.8.8/9] Disguised Keypad doesn't respect biome colors (Gray grass etc.)
- Fix: [1.8+] Password-protected Furnace doesn't drop items when being broken
- Fix: [1.8+] Security Camera doesn't update Redstone correctly when the Redstone Module is removed/added/turned on/turned off
- Fix: [1.10.2+] SecurityCraft Tile Entity data doesn't get synchronized correctly with clients on world load [1]
- Fix: [1.10.2+] Module GUI cannot be accessed
- Fix: [1.10.2+] Crashes
- Fix: [1.10.2+] Alarm sound volume config option does not affect the ingame sound
- Fix: [1.11.2+] Incorrect string in Password-protected Furnace GUI
- Fix: [1.11.2+] Some SecurityCraft sounds don't play at all (Taser/Camera)
- Removed: Tip for /sc connect
- Internal: Refactoring to make code a little more readable and cleaner
- Internal: Removed legacy code

[1] This fixes:
    1. The camera not rotating when reloading the world
    2. The Redstone Module not working when trying to change the camera's redstone output right after reloading the world
    3. The Keypad not being disguised after reloading the world
    4. Probably some other things
    
--------------------------Changelog for v1.8.3 of SecurityCraft (this should have been v1.8.5)--------------------------

- New: Reinforced Blocks
    - Logs
    - Lapis Lazuli Block
    - Block of Coal
    - Block of Gold
    - Block of Iron
    - Block of Diamond
    - Block of Emerald
    - Wool
    - Quartz incl. slabs and stairs
    - [1.8+] Prismarine/Prismarine Bricks/Dark Prismarine
    - [1.8+] Red Sandstone incl. slabs and stairs
    - [1.8+] (Smooth) Granite/Andesite/Diorite
    - [1.10.2+] End Stone Bricks
    - [1.10.2+] Red Nether Brick
    - [1.10.2+] Purpur incl. slabs and stairs
    - [1.12.2] Concrete
- New: Keypad Gurnace
- New: Information about how to exit the Security Camera
- New: Cameras can now be unbound from within the Camera Monitors' GUI, even if they're no longer present in the world (press the X at the top right of the respective button)
- New: [1.8+] JEI (JustEnoughItems) now shows information about blocks and items without a recipe
- Change: The SecurityCraft Manual now only displays one general page about reinforced blocks as not to clutter the book
- Fix: Reinforced Stained Hardened Clay (1.12.2: Terracotta) isn't craftable
- Fix: Several incorrect language strings
- Fix: Mines can be activated when viewing a camera (thanks LeKoopa!)
- Fix: Incorrect string in Password-protected Furnace GUI
- Fix: Crash involving the new Camera Monitor indicator (overlay in inventory when looking at a camera)
- Fix: The Camera Monitor's inventory overlay sometimes shows incorrect information
- Fix: Players get kicked sometimes when using the Codebreaker on a server
- Fix: Issue when rightclicking a block with a module
- Fix: The '/sc' command doesn't always show help when executing it incorrectly
- Fix: [1.8+] Crash when trying to open a blocked Password-protected Chest
- Fix: [1.8+] Unlocalized string in I.M.S. settings menu
- Fix: [1.8.8+] Incorrect rendering of the Camera Monitor's inventory overlay
- Fix: [1.8.8+] Buttons overlapping with the JEI interface are not accessible
- Fix: [1.10.2+] Sponge incompatibilities (~~untested on 1.10.2 and 1.11.2, please report any issues you find to our Discord's #bugreport channel.~~ As of 1. January 2018 Sponge no longer supports 1.10/1.11 versions, SecurityCraft will do the same)
- Fix: [1.10.2+] I.M.S. settings menu is not accessible
- Removed: IRC support chat. Please refer to the #help channel on SecurityCraft's Discord! https://discord.gg/U8DvBAW
- Internal: Rewrote handling of reinforced blocks (Now much easier to add them)

**Hotfixes:**
- Fix: [1.10.2] Crash on server startup (Thanks Baconator_NoVeg!)

--------------------------Changelog for v1.8.2.4 of SecurityCraft (this should have been v1.8.4.1)--------------------------

- New: Camera can be set to a fixed angle using the Universal Block Modifier
- New: When looking at a camera while holding a monitor, an overlay will be shown based on if the camera is added to the monitor or not
- New: [1.8+] Disabled recipes now show an empty grid in the SecurityCraft Manual
- Fix: Unintended behavior when using '/sc contact' on a multiplayer server
- Fix: Invalid Discord invite link
- Fix: IRC security issue
- Fix: Incorrect German language strings
- Fix: Retinal Scanner doesn't respect the whitelist module
- Fix: Adding/Removing an active Redstone Module does not update the state of connected redstone
- Fix: [1.7.10] Inconsistent behavior when opening a keypad while being whitelisted
- Fix: [1.7.10] Reinforced Door can be held open with a redstone input (thanks LeKoopa!)
- Fix: [1.7.10] Security Camera cannot emit redstone signal
- Fix: [1.7.10-1.8.8/9] Unable to exit out of password GUIs
- Fix: [1.11.2+] Installed modules disappear in certain situations
- Fix: [1.12.2] Keycard recipes cannot be disabled via config
- Fix: [1.12.2] WAILA can now be used again (Use Hwyla https://minecraft.curseforge.com/projects/hwyla)

--------------------------Changelog for v1.8.2.3 of SecurityCraft (v1.8.2.3-hotfix below) (this should have been v1.8.4, also could have made v1.9.0 with the reinforced blocks from v1.8.3 above and call it "Reinforced Update" -.-)--------------------------

- New: Reinforced Blocks
    - Stone Bricks (normal, mossy, cracked, chiseled) incl. stairs and slabs
    - Mossy Cobblestone
    - Bricks incl. stairs and slabs
    - Nether Bricks incl. stairs and slabs
    - Hardened Clay
    - Stained Hardened Clay (1.12: Terracotta)
- New: Official SecurityCraft server tip
- Change: Heavily nerfed Codebreaker. It now has 5 uses and a 1 in 3 chance of failing
- Fix: Recipe for Reinforced Glass does not show up in the SecurityCraft Manual
- Fix: WAILA does not update the new owner of a door when changed with a Universal Owner Changer
- Fix: Both halves of a Scanner Door can have different owners
- Fix: Cage Trap can be escaped
- Fix: Taser can tase the player who shot
- Fix: Reinforced Doors can be opened by any SC block, not only the ones with the same owner as the door
- Fix: Descriptions do not translate to different languages in the SecurityCraft Manual
- Fix: [1.8+] Reinforced Iron Bars placed by Cage Traps have no owner
- Fix: [1.8+] Reinforced Iron Fence does not damage players
- Fix: [1.8+] Reinforcing Andesite/Granite/Diorite gives back a glitched block
- Fix: [1.8+] Players get kicked sometimes when using the Password-protected Furnace
- Fix: [1.10.2] Reinforced Doors cannot be opened
- Fix: [1.10.2+] Username Logger cannot be opened
- Fix: [1.10.2+] Reinforced Stairs are turned incorrectly when placed upside down
- Fix: [1.10.2+] Upside down Reinforced Slabs show up incorrectly in WAILA
- Fix: [1.10.2+] Wrong Fake Liquids recipes showing up in the SecurityCraft Manual
- Fix: [1.10.2+] Glass Panes can be put into Universal Block Reinforcers
- Fix: [1.10.2+] Crash when breaking planks/sandstone with a Universal Block Reinforcer
- Fix: [1.10.2+] Universal Block Reinforcer does not show up when being held
- Fix: [1.10.2+] Reinforced Doors don't have a placing sound
- Fix: [1.11.2+] Server error when using a Redstone Module
- Fix: [1.12] Blocks scanning for players/mobs do not work correctly
- Fix: [1.12] Recipes are not grouped in Recipe Book
- Removed: [1.12] Config option to enable the old Keypad recipe

**Hotfixes:**
- Fix: Codebreaker can be enchanted with books at the anvil
- Fix: [1.10.2+] Issue with the recent Security Camera animation fix
- Fix: [1.10.2+] Reinforced stairs placed a certain way are still being displayed incorrectly
- Fix: [1.11.2+] New top slabs are displayed incorrectly

--------------------------Changelog for v1.8.2.2 of SecurityCraft (this should have been v1.8.3)--------------------------

- Ported to 1.10.2, 1.11.2, and 1.12
- New: Reinforced textures now adapt to the resourcepack being used
- New: The Cage Trap can now be set to capture hostile mobs via the Universal Block Modifier
- New: Information about needing the Redstone Module for the Security Camera
- New: Discord tip
- New: [1.10.2+] Stained Reinforced Glass now colors beacon beams
- Change: [1.10.2+] Recipes with Reinforced Glass Panes now use normal Reinforced Glass
- Change: [1.7.10] If you use LookingGlass, you now need at least version 0.2.0.01 of it to play
- Fix: Crash when adding an empty Disguise Module to a Keypad
- Fix: Missing German language strings
- Fix: Some GUIs cannot be closed
- Fix: The Universal Key Changer allows non digit characters
- Fix: Wrong texture for Reinforced Stone Slabs
- Fix: Crash when shift-clicking an item out of the Disguise Module's slot
- Fix: Security Camera can be broken without a Universal Block Remover
- Fix: Alarm bounding box is too large for top/bottom alarm
- Fix: Missing language strings for SecurityCraft Manual and Reinforced Planks within the SecurityCraft Manual
- Fix: Pick block does not work on Keypads
- Fix: [1.8.8/9] Keypad crash
- Fix: [1.8, 1.8.8/9] Bouncing Betty can explode while it is defused
- Removed: [1.10.2+] Reinforced Glass Pane (updating this would have required a complete rewrite and a big chunk of time. Our priorities are sadly not positioned here)
- Removed: [1.10.2+] Reinforced Dirt Slab (The slab was not working at all and despite tons of debugging and checking, we could not iron out the issue)

--------------------------Changelog for v1.8.2.1 of SecurityCraft--------------------------

- Fix: Rare crash when entering a world having used the IRC feature beforehand
- Fix: Alarm crashes the game
- Fix: Retinal Scanners and Scanner Doors can be activated while looking through a camera
- Fix: Wrong description of Smart/Storage Modules in Inventory Scanner
- Fix: Version gets added incorrectly to the welcome message
- Fix: WAILA shows that a Keycard Reader can have a password
- Fix: WAILA distinguishes between fake and real lava/water
- Fix: Specific crashes reported by OpenEye
- Fix: [1.7.10] Defusing a mine removes owner
- Fix: [1.7.10] Codebreaker does not work on Keypads
- Fix: [1.8, 1.8.8/9] Unable to add players to modules

--------------------------Changelog for v1.8.2 of SecurityCraft--------------------------

- New: Added config option to disable SecurityCraft's built-in version checking feature
- New: The admin tool can automatically open keycard readers by right-clicking on it
- New: A GUI displaying IRC information opens after typing "/sc connect"
- New: Security cameras can now have a custom name which is displayed in the monitor GUI
- New: Laser blocks can now be enabled/disabled
- New: Links sent through IRC are now clickable
- New: Recipe tooltips in the SecurityCraft Manual
- New: Blocks without a recipe now have an explanation on how to create them on their SecurityCraft Manual page
- New: Scanner Door (Acts like a Retinal Scanner and Reinforced Door in one)
- New: Alongside the already existing process of creating reinforced blocks, you can now rightclick the Universal Block Reinforcer, insert an item into the slot and close the GUI to quickly reinforce stacks of blocks
- New: Option to disable the Portable Radar using the Universal Block Modifier
- New: Keypads can now be disguised as other blocks by inserting a Disguise Module into it
- New: Buttons at the beginning and end of the SecurityCraft Manual for easier navigation
- API: Added CustomizableSCTE.linkable() which allows you to "link" two blocks together, and run code between them
- API: Added CameraView, a wrapper class to handle different camera views
- Change: Bouncing betties can now be defused
- Change: /sc contact now doesn't require a message, instead it changes your normal chat to send to IRC instead of Minecraft chat. You can use /sc resume to go back to normal Minecraft chat
- Fix: Crash with username logger not checking if the name it saves is actually a player or not
- Fix: Rare crash with blocks implementing IIntersectable
- Fix: Incorrect password-protected chest recipe being shown in the SecurityCraft manual
- Fix: Retinal scanners can be activated by non-whitelisted players that are not the owner
- Fix: Camera monitor displaying "0/30 cameras" in the monitor's tooltip when 30 cameras are bound to it
- Fix: Crash which occurs when SecurityCraft's update .json file isn't downloaded properly at startup
- Fix: Crash when opening a monitor with more than 10 cameras bound to it
- Fix: Unbinding the first bound camera from a monitor restricts access to other cameras bound to the same monitor
- Fix: Portable Radar option to disable repeating message does not show
- Fix: Language strings regarding block options
- Fix: Portable Radar crash
- Fix: Resizing Minecraft while having the SecurityCraft Manual open doesn't update tooltips correctly
- Fix: Hostile mobs attack the player when he is viewing a camera
- Fix: Cage Trap can be activated by its owner
- Fix: Protecto attacks whitelisted players
- Fix: The Portable Radar sends a message when its owner is in its radius
- Fix: Translations don't work in the SC Manual under certain circumstances
- Fix: [1.8, 1.8.8/9] North-facing camera views being able to rotate backwards when turning left, and not being able to turn right after previously turning left
- Fix: [1.8, 1.8.8/9] Reinforced Doors can be activated by normal redstone

--------------------------Changelog for v1.8.1 of SecurityCraft--------------------------

- New: [Protecto](http://megaman.wikia.com/wiki/Protecto)
- New: Briefcase
- New: Notification if player is banned from IRC
- New: Information on how IRC works
- New: Camera Monitor now shows how many cameras are bound to it
- New: Added config option to configure camera speed when not using LookingGlass
- New: All chat messages/item tooltips/GUI elements/config options etc. are now translateable
- New: Added descriptions to all SecurityCraft config options
- New: 1.7.10 updated to Forge v10.13.3.1420, 1.8 updated to Forge v11.14.3.1556
- New: 1.8.8 port using Forge v11.15.0.1596
- New: GoogleDocs form to report crashes/bugs (see /sc bug)
- New: Clickable links in the Trello and Patreon SecurityCraft tips, and for the new GoogleDocs form link in /sc bug
- New: The admin tool now shows a "no info" message when right-clicking a block with no owner, password, or module inserted
- New: Custom options for keypads, portable radars, and security cameras
- New: Spam detection while using /sc contact will not allow users to send the same message more than two times consecutively
- New: [1.8] Added support for Forge v11.14.3.1556+'s built-in update checker
- API: Added TileEntitySCTE.attacks(), which you can use to have an attack() method automatically called
- API: Added Owner class which allows for easy access to player's names and UUIDs, with a few helpful methods as well
- API: Added IPasswordProtected.onCodebreakerUsed() and IPasswordProtected.openPasswordGUI()
- API: Added option, which allows you to add custom, "per-block" configuration values
- API: Added INameable, which allows you to set a custom name for a specific TileEntity
- API: General improvements
- Change: Improved IRC messaging system
- Change: Improved cracked client detection to automatically kick them from IRC
- Change: Reinforced glass and reinforced glass panes drop after breaking again
- Change: Camera monitors can now store up to 30 cameras when not using LookingGlass
- Change: Camera selection GUI when not using LookingGlass
- Change: Changed the name of some SecurityCraft files
- Fix: Some messages and texts don't display correctly
- Fix: Everyone connected to IRC from Minecraft gets kicked if a kick in the channel occurs
- Fix: Crash occuring when mounted to a camera
- Fix: Crash when mounting a camera which is directly under a block
- Fix: Crash when trying to mount a non-existing camera
- Fix: Crash with Inventory Scanner
- Fix: Blocks can be broken when mounted to a camera
- Fix: Security Cameras break when a block is placed next to them if they face north or west
- Fix: Unbinding first bound Camera from Monitor denies access to all cameras bound afterwards
- Fix: Waila shows "\<ERROR\>" while looking at a newly placed password-protected chest
- Fix: [1.7.10] Cameras don't emit a redstone signal
- Fix: [1.7.10] Monitors require a second right-click to display a camera's view (when using LookingGlass)
- Fix: [1.8] Tasers are held incorrectly in 3rd person mode
- Fix: [1.8] Security cameras and fake water/lava cause "Model definition for location securitycraft:X#Y not found" errors
- Fix: [1.8] Inventory scanners don't accept storage modules
- Removed: Some redundant/unused code
